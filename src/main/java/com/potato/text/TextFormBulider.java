package com.potato.text;

import java.util.ArrayList;
import java.util.List;

public class TextFormBulider {
    private TextForm textForm;

    protected TextFormBulider(TextForm textForm) {
        this.textForm = textForm;
    }

    public TextFormBulider title(String... titles) {
        if (textForm.maxCol < titles.length) {
            textForm.maxCol = titles.length;
        }
        for (String title : titles) {
            if (title == null) {
                title = "null";
            }
            textForm.title.add(title);
        }
        return this;
    }

    public TextFormBulider paddingL(int paddingL) {
        textForm.paddingL = paddingL;
        return this;
    }

    public TextFormBulider paddingR(int paddingR) {
        textForm.paddingR = paddingR;
        return this;
    }

    public TextFormBulider separator(char separator) {
        textForm.separator = separator;
        return this;
    }

    public TextFormBulider colMaxLength(int colMaxLength) {
        textForm.colMaxLength = colMaxLength;
        return this;
    }

    public TextFormBulider addRow(String... cols) {
        if (textForm.maxCol < cols.length) {
            textForm.maxCol = cols.length;
        }
        List<String> list = new ArrayList<>(cols.length);
        for (String col : cols) {
            if (col == null) {
                col = "null";
            }
            list.add(col);
        }
        textForm.datas.add(list);
        return this;
    }

    public TextForm finish() {
        int titleSize = textForm.title.size();
        if (titleSize < textForm.maxCol) {
            for (int i = 0; i < textForm.maxCol - titleSize; i++) {
                textForm.title.add(null);
            }
        }
        for (List<String> data : textForm.datas) {
            int dataSize = data.size();
            if (dataSize < textForm.maxCol) {
                for (int i = 0; i < textForm.maxCol - dataSize; i++) {
                    data.add(null);
                }
            }
        }
        return textForm;
    }
}
