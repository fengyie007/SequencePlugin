package org.intellij.sequencer.impl;

import org.intellij.sequencer.SequenceNavigable;
import org.intellij.sequencer.generator.filters.CompositeMethodFilter;
import org.intellij.sequencer.generator.filters.MethodFilter;

import java.util.List;

public class EmptySequenceNavigable implements SequenceNavigable {
    @Override
    public void openClassInEditor(String className) {

    }

    @Override
    public void openMethodInEditor(String className, String methodName, List<String> argTypes) {

    }

    @Override
    public boolean isInsideAMethod() {
        return false;
    }

    @Override
    public void openMethodCallInEditor(MethodFilter filter, String fromClass, String fromMethod, List<String> fromArgTypes, String toClass, String toMethod, List<String> toArgType, int offset) {

    }

    @Override
    public List<String> findImplementations(String className) {
        return null;
    }

    @Override
    public List<String> findImplementations(String className, String methodName, List<String> argTypes) {
        return null;
    }

    @Override
    public void openLambdaExprInEditor(String fromClass, String fromMethod, List<String> fromArgTypes, List<String> argTypes, String returnType, int integer) {

    }

    @Override
    public void openMethodCallInsideLambdaExprInEditor(CompositeMethodFilter methodFilter, String fromClass, String enclosedMethodName, List<String> enclosedMethodArgTypes, List<String> argTypes, String returnType, String toClass, String toMethod, List<String> toArgTypes, int offset) {

    }
}