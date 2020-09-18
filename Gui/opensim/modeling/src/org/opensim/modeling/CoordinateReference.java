/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateReference extends ReferenceDouble {
  private transient long swigCPtr;

  public CoordinateReference(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.CoordinateReference_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateReference obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_CoordinateReference(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateReference safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.CoordinateReference_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateReference(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.CoordinateReference_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.CoordinateReference_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.CoordinateReference_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateReference(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.CoordinateReference_getConcreteClassName(swigCPtr, this);
  }

  public CoordinateReference() {
    this(opensimSimulationJNI.new_CoordinateReference__SWIG_0(), true);
  }

  public CoordinateReference(String name, Function ReferenceFunction) {
    this(opensimSimulationJNI.new_CoordinateReference__SWIG_1(name, Function.getCPtr(ReferenceFunction), ReferenceFunction), true);
  }

  public CoordinateReference(CoordinateReference source) {
    this(opensimSimulationJNI.new_CoordinateReference__SWIG_2(CoordinateReference.getCPtr(source), source), true);
  }

  public int getNumRefs() {
    return opensimSimulationJNI.CoordinateReference_getNumRefs(swigCPtr, this);
  }

  public SimTKArrayString getNames() {
    return new SimTKArrayString(opensimSimulationJNI.CoordinateReference_getNames(swigCPtr, this), false);
  }

  public void getValuesAtTime(double time, SimTKArrayDouble values) {
    opensimSimulationJNI.CoordinateReference_getValuesAtTime(swigCPtr, this, time, SimTKArrayDouble.getCPtr(values), values);
  }

  public void getWeights(State s, SimTKArrayDouble weights) {
    opensimSimulationJNI.CoordinateReference_getWeights(swigCPtr, this, State.getCPtr(s), s, SimTKArrayDouble.getCPtr(weights), weights);
  }

  public double getValue(State s) {
    return opensimSimulationJNI.CoordinateReference_getValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getSpeedValue(State s) {
    return opensimSimulationJNI.CoordinateReference_getSpeedValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getAccelerationValue(State s) {
    return opensimSimulationJNI.CoordinateReference_getAccelerationValue(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getWeight(State s) {
    return opensimSimulationJNI.CoordinateReference_getWeight(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setWeight(double weight) {
    opensimSimulationJNI.CoordinateReference_setWeight(swigCPtr, this, weight);
  }

  public void setValueFunction(Function function) {
    opensimSimulationJNI.CoordinateReference_setValueFunction(swigCPtr, this, Function.getCPtr(function), function);
  }

}
