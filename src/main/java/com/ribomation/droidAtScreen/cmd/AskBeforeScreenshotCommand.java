/*
 * Project:  droidAtScreen
 * File:     AskBeforeScreenshotCommand.java
 * Modified: 2012-01-03
 *
 * Copyright (C) 2011, Ribomation AB (Jens Riboe).
 * http://blog.ribomation.com/
 *
 * You are free to use this software and the source code as you like.
 * We do appreciate if you attribute were it came from.
 */
package com.ribomation.droidAtScreen.cmd;

/**
 * Controls if a prompt should be shown before taking a screenshot.
 *
 * @user jens
 * @date Fri Sep 30 2011, 10:53:52 CEST
 */
public class AskBeforeScreenshotCommand extends CheckBoxCommand {

    public AskBeforeScreenshotCommand() {
        configure();
    }

    @Override
    protected boolean getPreferenceValue() {
        return getApplication().getSettings().isAskBeforeScreenshot();
    }

    @Override
    protected void setPreferenceValue(boolean value) {
        getApplication().getSettings().setAskBeforeScreenshot(value);
    }

    private void configure() {
        setLabel(getString("ask_before_screenshot"));
        setTooltip(getString("ask_before_screenshot_tooltip"));
    }
}
