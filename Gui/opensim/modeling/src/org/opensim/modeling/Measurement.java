/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Measurement extends OpenSimObject {
  private transient long swigCPtr;

  public Measurement(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.Measurement_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Measurement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_Measurement(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Measurement safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Measurement_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Measurement(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.Measurement_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.Measurement_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.Measurement_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Measurement(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.Measurement_getConcreteClassName(swigCPtr, this);
  }

  public Measurement() {
    this(opensimActuatorsAnalysesToolsJNI.new_Measurement__SWIG_0(), true);
  }

  public Measurement(Measurement aMeasurement) {
    this(opensimActuatorsAnalysesToolsJNI.new_Measurement__SWIG_1(Measurement.getCPtr(aMeasurement), aMeasurement), true);
  }

  public void copyData(Measurement aMeasurement) {
    opensimActuatorsAnalysesToolsJNI.Measurement_copyData(swigCPtr, this, Measurement.getCPtr(aMeasurement), aMeasurement);
  }

  public BodyScaleSet getBodyScaleSet() {
    return new BodyScaleSet(opensimActuatorsAnalysesToolsJNI.Measurement_getBodyScaleSet(swigCPtr, this), false);
  }

  public MarkerPairSet getMarkerPairSet() {
    return new MarkerPairSet(opensimActuatorsAnalysesToolsJNI.Measurement_getMarkerPairSet(swigCPtr, this), false);
  }

  public int getNumMarkerPairs() {
    return opensimActuatorsAnalysesToolsJNI.Measurement_getNumMarkerPairs(swigCPtr, this);
  }

  public MarkerPair getMarkerPair(int aIndex) {
    return new MarkerPair(opensimActuatorsAnalysesToolsJNI.Measurement_getMarkerPair(swigCPtr, this, aIndex), false);
  }

  public boolean getApply() {
    return opensimActuatorsAnalysesToolsJNI.Measurement_getApply(swigCPtr, this);
  }

  public void setApply(boolean aApply) {
    opensimActuatorsAnalysesToolsJNI.Measurement_setApply(swigCPtr, this, aApply);
  }

  public void applyScaleFactor(double aFactor, ScaleSet aScaleSet) {
    opensimActuatorsAnalysesToolsJNI.Measurement_applyScaleFactor(swigCPtr, this, aFactor, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public static void registerTypes() {
    opensimActuatorsAnalysesToolsJNI.Measurement_registerTypes();
  }

}
