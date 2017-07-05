/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class STOFileAdapterVec6 {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected STOFileAdapterVec6(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(STOFileAdapterVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_STOFileAdapterVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public STOFileAdapterVec6() {
    this(opensimCommonJNI.new_STOFileAdapterVec6__SWIG_0(), true);
  }

  public STOFileAdapterVec6(STOFileAdapterVec6 arg0) {
    this(opensimCommonJNI.new_STOFileAdapterVec6__SWIG_1(STOFileAdapterVec6.getCPtr(arg0), arg0), true);
  }

  public STOFileAdapterVec6 clone() {
    long cPtr = opensimCommonJNI.STOFileAdapterVec6_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new STOFileAdapterVec6(cPtr, true);
  }

  public static TimeSeriesTableVec6 read(String fileName) {
    return new TimeSeriesTableVec6(opensimCommonJNI.STOFileAdapterVec6_read(fileName), true);
  }

  public static void write(TimeSeriesTableVec6 table, String fileName) {
    opensimCommonJNI.STOFileAdapterVec6_write(TimeSeriesTableVec6.getCPtr(table), table, fileName);
  }

}