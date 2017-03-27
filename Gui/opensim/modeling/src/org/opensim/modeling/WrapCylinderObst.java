/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapCylinderObst extends WrapObject {
  private transient long swigCPtr;

  public WrapCylinderObst(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.WrapCylinderObst_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapCylinderObst obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_WrapCylinderObst(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapCylinderObst safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.WrapCylinderObst_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.WrapCylinderObst_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.WrapCylinderObst_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.WrapCylinderObst_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapCylinderObst(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.WrapCylinderObst_getConcreteClassName(swigCPtr, this);
  }

  public WrapCylinderObst() {
    this(opensimSimulationJNI.new_WrapCylinderObst__SWIG_0(), true);
  }

  public WrapCylinderObst(WrapCylinderObst aWrapCylinderObst) {
    this(opensimSimulationJNI.new_WrapCylinderObst__SWIG_1(WrapCylinderObst.getCPtr(aWrapCylinderObst), aWrapCylinderObst), true);
  }

  public void copyData(WrapCylinderObst aWrapCylinderObst) {
    opensimSimulationJNI.WrapCylinderObst_copyData(swigCPtr, this, WrapCylinderObst.getCPtr(aWrapCylinderObst), aWrapCylinderObst);
  }

  public double getRadius() {
    return opensimSimulationJNI.WrapCylinderObst_getRadius(swigCPtr, this);
  }

  public void setRadius(double aRadius) {
    opensimSimulationJNI.WrapCylinderObst_setRadius(swigCPtr, this, aRadius);
  }

  public double getLength() {
    return opensimSimulationJNI.WrapCylinderObst_getLength(swigCPtr, this);
  }

  public void setLength(double aLength) {
    opensimSimulationJNI.WrapCylinderObst_setLength(swigCPtr, this, aLength);
  }

  public int getWrapDirection() {
    return opensimSimulationJNI.WrapCylinderObst_getWrapDirection(swigCPtr, this);
  }

  public String getWrapTypeName() {
    return opensimSimulationJNI.WrapCylinderObst_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimSimulationJNI.WrapCylinderObst_getDimensionsString(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimSimulationJNI.WrapCylinderObst_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimSimulationJNI.WrapCylinderObst_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

}
