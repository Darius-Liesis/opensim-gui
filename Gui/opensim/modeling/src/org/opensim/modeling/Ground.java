/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Ground extends PhysicalFrame {
  private transient long swigCPtr;

  public Ground(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Ground_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Ground obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Ground(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Ground safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Ground_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Ground(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Ground_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Ground_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Ground_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Ground(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Ground_getConcreteClassName(swigCPtr, this);
  }

  public Ground() {
    this(opensimSimulationJNI.new_Ground(), true);
  }

}
