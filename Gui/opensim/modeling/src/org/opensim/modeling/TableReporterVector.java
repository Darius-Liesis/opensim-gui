/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableReporterVector extends ReporterVector {
  private transient long swigCPtr;

  public TableReporterVector(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TableReporterVector_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableReporterVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_TableReporterVector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TableReporterVector safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.TableReporterVector_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TableReporterVector(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.TableReporterVector_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.TableReporterVector_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.TableReporterVector_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TableReporterVector(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.TableReporterVector_getConcreteClassName(swigCPtr, this);
  }

  public TableReporterVector() {
    this(opensimCommonJNI.new_TableReporterVector(), true);
  }

  public TimeSeriesTable getTable() {
    return new TimeSeriesTable(opensimCommonJNI.TableReporterVector_getTable(swigCPtr, this), true);
  }

  public void clearTable() {
    opensimCommonJNI.TableReporterVector_clearTable(swigCPtr, this);
  }

}
