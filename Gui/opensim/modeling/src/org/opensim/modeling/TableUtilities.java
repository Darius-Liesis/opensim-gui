/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TableUtilities {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public TableUtilities(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(TableUtilities obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_TableUtilities(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static void checkNonUniqueLabels(StdVectorString labels) {
    opensimCommonJNI.TableUtilities_checkNonUniqueLabels(StdVectorString.getCPtr(labels), labels);
  }

  public static boolean isInDegrees(TimeSeriesTable table) {
    return opensimCommonJNI.TableUtilities_isInDegrees(TimeSeriesTable.getCPtr(table), table);
  }

  public static int findStateLabelIndex(ArrayStr labels, String desired) {
    return opensimCommonJNI.TableUtilities_findStateLabelIndex__SWIG_0(ArrayStr.getCPtr(labels), labels, desired);
  }

  public static int findStateLabelIndex(StdVectorString labels, String desired) {
    return opensimCommonJNI.TableUtilities_findStateLabelIndex__SWIG_1(StdVectorString.getCPtr(labels), labels, desired);
  }

  public static void filterLowpass(TimeSeriesTable table, double cutoffFreq, boolean padData) {
    opensimCommonJNI.TableUtilities_filterLowpass__SWIG_0(TimeSeriesTable.getCPtr(table), table, cutoffFreq, padData);
  }

  public static void filterLowpass(TimeSeriesTable table, double cutoffFreq) {
    opensimCommonJNI.TableUtilities_filterLowpass__SWIG_1(TimeSeriesTable.getCPtr(table), table, cutoffFreq);
  }

  public static void pad(TimeSeriesTable table, int numRowsToPrependAndAppend) {
    opensimCommonJNI.TableUtilities_pad(TimeSeriesTable.getCPtr(table), table, numRowsToPrependAndAppend);
  }

  public static TimeSeriesTableVec3 convertRotationsToEulerAngles(SWIGTYPE_p_OpenSim__TimeSeriesTable_T_SimTK__Rotation_T_SimTK__Real_t_t rotTable) {
    return new TimeSeriesTableVec3(opensimCommonJNI.TableUtilities_convertRotationsToEulerAngles(SWIGTYPE_p_OpenSim__TimeSeriesTable_T_SimTK__Rotation_T_SimTK__Real_t_t.getCPtr(rotTable)), true);
  }

  public TableUtilities() {
    this(opensimCommonJNI.new_TableUtilities(), true);
  }

}
