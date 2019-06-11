/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorMat33 extends VectorBaseMat33 {
  private transient long swigCPtr;

  public VectorMat33(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorMat33_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(VectorMat33 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorMat33(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorMat33() {
    this(opensimSimbodyJNI.new_VectorMat33__SWIG_0(), true);
  }

  public VectorMat33(VectorMat33 src) {
    this(opensimSimbodyJNI.new_VectorMat33__SWIG_1(VectorMat33.getCPtr(src), src), true);
  }

  public VectorMat33(int m, Mat33 initialValue) {
    this(opensimSimbodyJNI.new_VectorMat33__SWIG_2(m, Mat33.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.VectorMat33_toString(swigCPtr, this);
  }

  public Mat33 get(int i) {
    return new Mat33(opensimSimbodyJNI.VectorMat33_get(swigCPtr, this, i), false);
  }

  public void set(int i, Mat33 value) {
    opensimSimbodyJNI.VectorMat33_set(swigCPtr, this, i, Mat33.getCPtr(value), value);
  }

}
