/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorQuaternion extends VectorBaseQuaternion {
  private transient long swigCPtr;

  public VectorQuaternion(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorQuaternion_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorQuaternion() {
    this(opensimSimbodyJNI.new_VectorQuaternion__SWIG_0(), true);
  }

  public VectorQuaternion(VectorQuaternion src) {
    this(opensimSimbodyJNI.new_VectorQuaternion__SWIG_1(VectorQuaternion.getCPtr(src), src), true);
  }

  public VectorQuaternion(int m, Quaternion initialValue) {
    this(opensimSimbodyJNI.new_VectorQuaternion__SWIG_2(m, Quaternion.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.VectorQuaternion_toString(swigCPtr, this);
  }

  public Quaternion get(int i) {
    return new Quaternion(opensimSimbodyJNI.VectorQuaternion_get(swigCPtr, this, i), false);
  }

  public void set(int i, Quaternion value) {
    opensimSimbodyJNI.VectorQuaternion_set(swigCPtr, this, i, Quaternion.getCPtr(value), value);
  }

}
