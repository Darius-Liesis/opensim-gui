/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DataTableVec6 extends AbstractDataTable {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected DataTableVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.DataTableVec6_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataTableVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_DataTableVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DataTableVec6() {
    this(opensimCommonJNI.new_DataTableVec6__SWIG_0(), true);
  }

  public DataTableVec6(DataTableVec6 arg0) {
    this(opensimCommonJNI.new_DataTableVec6__SWIG_1(DataTableVec6.getCPtr(arg0), arg0), true);
  }

  public DataTableVec6(String filename, String tablename) {
    this(opensimCommonJNI.new_DataTableVec6__SWIG_2(filename, tablename), true);
  }

  public DataTable flatten() {
    return new DataTable(opensimCommonJNI.DataTableVec6_flatten__SWIG_0(swigCPtr, this), true);
  }

  public DataTable flatten(StdVectorString suffixes) {
    return new DataTable(opensimCommonJNI.DataTableVec6_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public long numComponentsPerElement() {
    return opensimCommonJNI.DataTableVec6_numComponentsPerElement(swigCPtr, this);
  }

  public void appendRow(double indRow, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_6_double_1_t_t container) {
    opensimCommonJNI.DataTableVec6_appendRow__SWIG_1(swigCPtr, this, indRow, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_6_double_1_t_t.getCPtr(container));
  }

  public void appendRow(double indRow, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_appendRow__SWIG_3(swigCPtr, this, indRow, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public void appendRow(double indRow, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_appendRow__SWIG_4(swigCPtr, this, indRow, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t getRowAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getRowAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t getRow(double ind) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getRow(swigCPtr, this, ind), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t updRowAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updRowAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t updRow(double ind) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updRow(swigCPtr, this, ind), true);
  }

  public void setRowAtIndex(long index, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_setRowAtIndex__SWIG_0(swigCPtr, this, index, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public void setRowAtIndex(long index, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_setRowAtIndex__SWIG_1(swigCPtr, this, index, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public void setRow(double ind, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_setRow__SWIG_0(swigCPtr, this, ind, SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public void setRow(double ind, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t depRow) {
    opensimCommonJNI.DataTableVec6_setRow__SWIG_1(swigCPtr, this, ind, SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_6_double_1_t_t.getCPtr(depRow));
  }

  public void removeRowAtIndex(long index) {
    opensimCommonJNI.DataTableVec6_removeRowAtIndex(swigCPtr, this, index);
  }

  public void removeRow(double ind) {
    opensimCommonJNI.DataTableVec6_removeRow(swigCPtr, this, ind);
  }

  public StdVectorDouble getIndependentColumn() {
    return new StdVectorDouble(opensimCommonJNI.DataTableVec6_getIndependentColumn(swigCPtr, this), false);
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_6_double_1_t_t container) {
    opensimCommonJNI.DataTableVec6_appendColumn__SWIG_1(swigCPtr, this, columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_6_double_1_t_t.getCPtr(container));
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_SimTK__Vector_T_SimTK__VecT_6_double_1_t_t depCol) {
    opensimCommonJNI.DataTableVec6_appendColumn__SWIG_3(swigCPtr, this, columnLabel, SWIGTYPE_p_SimTK__Vector_T_SimTK__VecT_6_double_1_t_t.getCPtr(depCol));
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t depCol) {
    opensimCommonJNI.DataTableVec6_appendColumn__SWIG_4(swigCPtr, this, columnLabel, SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t.getCPtr(depCol));
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t getDependentColumnAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t getDependentColumn(String columnLabel) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t updDependentColumnAtIndex(long index) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t updDependentColumn(String columnLabel) {
    return new SWIGTYPE_p_SimTK__VectorView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public void setIndependentValueAtIndex(long rowIndex, double value) {
    opensimCommonJNI.DataTableVec6_setIndependentValueAtIndex(swigCPtr, this, rowIndex, value);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t getMatrix() {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getMatrix(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t getMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_getMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t updMatrix() {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updMatrix(swigCPtr, this), false);
  }

  public SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t updMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new SWIGTYPE_p_SimTK__MatrixView_T_SimTK__VecT_6_double_1_t_t(opensimCommonJNI.DataTableVec6_updMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth, long precision) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_0(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth, precision);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_2(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_3(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_4(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels);
  }

  public String toString(StdVectorInt rows) {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_5(swigCPtr, this, StdVectorInt.getCPtr(rows), rows);
  }

  public String toString() {
    return opensimCommonJNI.DataTableVec6_toString__SWIG_6(swigCPtr, this);
  }

}
