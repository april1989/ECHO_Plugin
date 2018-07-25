package com.ibm.wala.cast.java.client.impl;

import com.ibm.wala.ipa.callgraph.AnalysisCache;
import com.ibm.wala.ipa.callgraph.AnalysisOptions;
import com.ibm.wala.ipa.callgraph.AnalysisScope;
import com.ibm.wala.ipa.callgraph.CallGraphBuilder;
import com.ibm.wala.ipa.callgraph.ContextSelector;
import com.ibm.wala.ipa.callgraph.impl.Util;
import com.ibm.wala.ipa.callgraph.propagation.SSAContextInterpreter;
import com.ibm.wala.ipa.callgraph.propagation.cfa.ZeroXCFABuilder;
import com.ibm.wala.ipa.callgraph.propagation.cfa.ZeroXInstanceKeys;
import com.ibm.wala.ipa.cha.IClassHierarchy;

public class VanillaZeroOneCFABuilderFactory {

  public CallGraphBuilder make(AnalysisOptions options, AnalysisCache cache,
      IClassHierarchy cha, AnalysisScope scope, ContextSelector customSelector, SSAContextInterpreter customInterpreter) {

    if (options == null) {
      throw new IllegalArgumentException("options is null");
    }
    Util.addDefaultSelectors(options, cha);
    Util.addDefaultBypassLogic(options, scope, Util.class.getClassLoader(), cha);

    return new ZeroXCFABuilder(cha, options, cache, customSelector, customInterpreter, ZeroXInstanceKeys.ALLOCATIONS | ZeroXInstanceKeys.CONSTANT_SPECIFIC);
  }

}
