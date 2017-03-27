/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AdhocModelComponent extends ModelComponent {
  private transient long swigCPtr;

  public AdhocModelComponent(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AdhocModelComponent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_AdhocModelComponent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AdhocModelComponent safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AdhocModelComponent(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AdhocModelComponent(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.AdhocModelComponent_getConcreteClassName(swigCPtr, this);
  }

  public AdhocModelComponent() {
    this(opensimActuatorsAnalysesToolsJNI.new_AdhocModelComponent(), true);
  }

}
