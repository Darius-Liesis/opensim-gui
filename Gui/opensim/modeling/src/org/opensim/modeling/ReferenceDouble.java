/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ReferenceDouble extends OpenSimObject {
  private transient long swigCPtr;

  public ReferenceDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ReferenceDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ReferenceDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ReferenceDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ReferenceDouble safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ReferenceDouble_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ReferenceDouble(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ReferenceDouble_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ReferenceDouble_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ReferenceDouble_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ReferenceDouble(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ReferenceDouble_getConcreteClassName(swigCPtr, this);
  }

  public int getNumRefs() {
    return opensimSimulationJNI.ReferenceDouble_getNumRefs(swigCPtr, this);
  }

  public Vec2 getValidTimeRange() {
    return new Vec2(opensimSimulationJNI.ReferenceDouble_getValidTimeRange(swigCPtr, this), true);
  }

  public SimTKArrayString getNames() {
    return new SimTKArrayString(opensimSimulationJNI.ReferenceDouble_getNames(swigCPtr, this), false);
  }

  public void getValues(State s, SimTKArrayDouble values) {
    opensimSimulationJNI.ReferenceDouble_getValues__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(values), values);
  }

  public void getWeights(State s, SimTKArrayDouble weights) {
    opensimSimulationJNI.ReferenceDouble_getWeights__SWIG_0(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public SimTKArrayDouble getValues(State s) {
    return new SimTKArrayDouble(opensimSimulationJNI.ReferenceDouble_getValues__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public SimTKArrayDouble getWeights(State s) {
    return new SimTKArrayDouble(opensimSimulationJNI.ReferenceDouble_getWeights__SWIG_1(swigCPtr, this, State.getCPtr(s), s), true);
  }

}
