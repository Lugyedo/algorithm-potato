package com.potato.text;

import dnl.utils.text.table.TextTable;

public class TextFormTest {
    public static void main(String[] args) {
//        TextForm.bulider()
//                .title("name", "age", "sex")
//                .addRow("王麻345子", "21", "男2")
//                .addRow("wzeefgrerhei", "21", "男")
//                .colMaxLength(5)
//                .separator('*')
//                .paddingR(2)
//                .paddingL(2)
//                .finish()
//                .printFormat();

        String[] titles = new String[]{"name", "age", "sex"};
        String[][] values = new String[][]{{"wzeefgrerhei", "21", "男"},
                {"wzeefgrerhei", "21", "男"}};
        TextTable tt = new TextTable(titles, values);
        tt.printTable();
    }
}
