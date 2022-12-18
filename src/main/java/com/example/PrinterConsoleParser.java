package com.example;

import com.example.utils.CanonPrinterConsoleUtils;

/**
 * @author YouChuanlong
 * @date 2022/12/12 14:03
 */
public class PrinterConsoleParser {

    public static void main(String[] args) {

        CanonPrinterConsoleUtils consoleUtils = new CanonPrinterConsoleUtils();
        consoleUtils.login("admin","123");
    }
}
