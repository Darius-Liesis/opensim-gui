/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetConstraints extends SetConstraints {
  private transient long swigCPtr;

  public ModelComponentSetConstraints(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetConstraints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetConstraints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetConstraints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetConstraints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetConstraints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetConstraints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetConstraints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetConstraints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetConstraints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetConstraints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetConstraints_getConcreteClassName(swigCPtr, this);
  }

  public void extendFinalizeFromProperties() {
    opensimSimulationJNI.ModelComponentSetConstraints_extendFinalizeFromProperties(swigCPtr, this);
  }

  public ModelComponentSetConstraints() {
    this(opensimSimulationJNI.new_ModelComponentSetConstraints(), true);
  }

}
