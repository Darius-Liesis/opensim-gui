/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixBaseMat33 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MatrixBaseMat33(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixBaseMat33 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixBaseMat33(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int nrow() {
    return opensimSimbodyJNI.MatrixBaseMat33_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.MatrixBaseMat33_ncol(swigCPtr, this);
  }

  public boolean isResizeable() {
    return opensimSimbodyJNI.MatrixBaseMat33_isResizeable(swigCPtr, this);
  }

  public MatrixBaseMat33() {
    this(opensimSimbodyJNI.new_MatrixBaseMat33__SWIG_0(), true);
  }

  public MatrixBaseMat33(int m, int n) {
    this(opensimSimbodyJNI.new_MatrixBaseMat33__SWIG_1(m, n), true);
  }

  public void clear() {
    opensimSimbodyJNI.MatrixBaseMat33_clear(swigCPtr, this);
  }

  public MatrixBaseMat33 setTo(Mat33 t) {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_setTo(swigCPtr, this, Mat33.getCPtr(t), t), false);
  }

  public MatrixBaseMat33 setToNaN() {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_setToNaN(swigCPtr, this), false);
  }

  public MatrixBaseMat33 setToZero() {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_setToZero(swigCPtr, this), false);
  }

  public RowVectorViewMat33 row(int i) {
    return new RowVectorViewMat33(opensimSimbodyJNI.MatrixBaseMat33_row(swigCPtr, this, i), true);
  }

  public RowVectorViewMat33 updRow(int i) {
    return new RowVectorViewMat33(opensimSimbodyJNI.MatrixBaseMat33_updRow(swigCPtr, this, i), true);
  }

  public VectorViewMat33 col(int j) {
    return new VectorViewMat33(opensimSimbodyJNI.MatrixBaseMat33_col(swigCPtr, this, j), true);
  }

  public VectorViewMat33 updCol(int j) {
    return new VectorViewMat33(opensimSimbodyJNI.MatrixBaseMat33_updCol(swigCPtr, this, j), true);
  }

  public Mat33 getElt(int i, int j) {
    return new Mat33(opensimSimbodyJNI.MatrixBaseMat33_getElt(swigCPtr, this, i, j), false);
  }

  public Mat33 updElt(int i, int j) {
    return new Mat33(opensimSimbodyJNI.MatrixBaseMat33_updElt(swigCPtr, this, i, j), false);
  }

  public MatrixBaseMat33 negateInPlace() {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_negateInPlace(swigCPtr, this), false);
  }

  public MatrixBaseMat33 resize(int m, int n) {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_resize(swigCPtr, this, m, n), false);
  }

  public MatrixBaseMat33 resizeKeep(int m, int n) {
    return new MatrixBaseMat33(opensimSimbodyJNI.MatrixBaseMat33_resizeKeep(swigCPtr, this, m, n), false);
  }

  public void lockShape() {
    opensimSimbodyJNI.MatrixBaseMat33_lockShape(swigCPtr, this);
  }

  public void unlockShape() {
    opensimSimbodyJNI.MatrixBaseMat33_unlockShape(swigCPtr, this);
  }

  public final static int NScalarsPerElement = opensimSimbodyJNI.MatrixBaseMat33_NScalarsPerElement_get();
  public final static int CppNScalarsPerElement = opensimSimbodyJNI.MatrixBaseMat33_CppNScalarsPerElement_get();

}
