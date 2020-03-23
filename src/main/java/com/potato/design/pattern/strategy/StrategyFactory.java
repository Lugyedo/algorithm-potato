package com.potato.design.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dehuab
 * 因为策略模式会包含一组策略，在使用它们的时候，一般会通过类型（type）来判断创建哪个策略来使用。
 * 为了封装创建逻辑，我们需要对客户端代码屏蔽创建细节。
 * 我们可以把根据 type 创建策略的逻辑抽离出来，放到工厂类中。
 */
public class StrategyFactory {
    /**
     * 一般来讲，如果策略类是无状态的，不包含成员变量，只是纯粹的算法实现，
     * 这样的策略对象是可以被共享使用的，不需要在每次调用 getStrategy() 的时候，都创建一个新的策略对象。
     * 针对这种情况，可以事先创建好每个策略对象，缓存到工厂类中，用的时候直接返回。
     * <p>
     * 相反，如果策略类是有状态的
     * 根据业务场景的需要，希望每次从工厂方法中，获得的都是新创建的策略对象，而不是缓存好可共享的策略对象
     * 那就需要在策略工厂中每次都查创建新的策略对象
     */
    private static final Map<String, Strategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("A", new ConcreteStrategyA());
        STRATEGIES.put("B", new ConcreteStrategyB());
    }

    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        return STRATEGIES.get(type);
    }
}
