/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixVec3 extends MatrixBaseVec3 {
  private transient long swigCPtr;

  public MatrixVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixVec3() {
    this(opensimSimbodyJNI.new_MatrixVec3__SWIG_0(), true);
  }

  public MatrixVec3(MatrixVec3 src) {
    this(opensimSimbodyJNI.new_MatrixVec3__SWIG_1(MatrixVec3.getCPtr(src), src), true);
  }

  public MatrixVec3(int m, int n) {
    this(opensimSimbodyJNI.new_MatrixVec3__SWIG_2(m, n), true);
  }

  public MatrixVec3(int m, int n, Vec3 initialValue) {
    this(opensimSimbodyJNI.new_MatrixVec3__SWIG_3(m, n, Vec3.getCPtr(initialValue), initialValue), true);
  }

  public String toString() {
    return opensimSimbodyJNI.MatrixVec3_toString(swigCPtr, this);
  }

  public Vec3 get(int i, int j) {
    return new Vec3(opensimSimbodyJNI.MatrixVec3_get(swigCPtr, this, i, j), false);
  }

  public void set(int i, int j, Vec3 value) {
    opensimSimbodyJNI.MatrixVec3_set(swigCPtr, this, i, j, Vec3.getCPtr(value), value);
  }

}
