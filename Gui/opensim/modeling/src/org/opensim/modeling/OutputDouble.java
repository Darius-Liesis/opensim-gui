/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class OutputDouble extends AbstractOutput {
  private transient long swigCPtr;

  public OutputDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.OutputDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(OutputDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_OutputDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OutputDouble() {
    this(opensimCommonJNI.new_OutputDouble__SWIG_0(), true);
  }

  public OutputDouble(String name, SWIGTYPE_p_std__functionT_void_fOpenSim__Component_const_p_SimTK__State_const_R_std__string_const_R_double_RF_t outputFunction, Stage dependsOnStage, boolean isList) {
    this(opensimCommonJNI.new_OutputDouble__SWIG_1(name, SWIGTYPE_p_std__functionT_void_fOpenSim__Component_const_p_SimTK__State_const_R_std__string_const_R_double_RF_t.getCPtr(outputFunction), Stage.getCPtr(dependsOnStage), dependsOnStage, isList), true);
  }

  public OutputDouble(OutputDouble source) {
    this(opensimCommonJNI.new_OutputDouble__SWIG_2(OutputDouble.getCPtr(source), source), true);
  }

  public boolean isCompatible(AbstractOutput o) {
    return opensimCommonJNI.OutputDouble_isCompatible(swigCPtr, this, AbstractOutput.getCPtr(o), o);
  }

  public void compatibleAssign(AbstractOutput o) {
    opensimCommonJNI.OutputDouble_compatibleAssign(swigCPtr, this, AbstractOutput.getCPtr(o), o);
  }

  public void clearChannels() {
    opensimCommonJNI.OutputDouble_clearChannels(swigCPtr, this);
  }

  public void addChannel(String channelName) {
    opensimCommonJNI.OutputDouble_addChannel(swigCPtr, this, channelName);
  }

  public AbstractChannel getChannel(String name) {
    return new AbstractChannel(opensimCommonJNI.OutputDouble_getChannel(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_OpenSim__OutputT_double_t__Channel_t getChannels() {
    return new SWIGTYPE_p_std__mapT_std__string_OpenSim__OutputT_double_t__Channel_t(opensimCommonJNI.OutputDouble_getChannels(swigCPtr, this), false);
  }

  public double getValue(State state) {
    return opensimCommonJNI.OutputDouble_getValue(swigCPtr, this, State.getCPtr(state), state);
  }

  public String getTypeName() {
    return opensimCommonJNI.OutputDouble_getTypeName(swigCPtr, this);
  }

  public String getValueAsString(State state) {
    return opensimCommonJNI.OutputDouble_getValueAsString(swigCPtr, this, State.getCPtr(state), state);
  }

  public AbstractOutput clone() {
    long cPtr = opensimCommonJNI.OutputDouble_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new OutputDouble(cPtr, true);
  }

  public static boolean isA(AbstractOutput p) {
    return opensimCommonJNI.OutputDouble_isA(AbstractOutput.getCPtr(p), p);
  }

  public static OutputDouble downcast(AbstractOutput p) {
    return new OutputDouble(opensimCommonJNI.OutputDouble_downcast(AbstractOutput.getCPtr(p), p), false);
  }

  public static OutputDouble updDowncast(AbstractOutput p) {
    return new OutputDouble(opensimCommonJNI.OutputDouble_updDowncast(AbstractOutput.getCPtr(p), p), false);
  }

  public static OutputDouble safeDownCast(AbstractOutput parent) {
    long cPtr = opensimCommonJNI.OutputDouble_safeDownCast(AbstractOutput.getCPtr(parent), parent);
    return (cPtr == 0) ? null : new OutputDouble(cPtr, false);
  }

}
