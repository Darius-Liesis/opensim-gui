/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleFixedWidthPennationModel extends ModelComponent {
  private transient long swigCPtr;

  public MuscleFixedWidthPennationModel(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.MuscleFixedWidthPennationModel_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleFixedWidthPennationModel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_MuscleFixedWidthPennationModel(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleFixedWidthPennationModel safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.MuscleFixedWidthPennationModel_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MuscleFixedWidthPennationModel_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleFixedWidthPennationModel(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_optimal_fiber_length(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_optimal_fiber_length(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_fiber_length(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_fiber_length(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_optimal_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_optimal_fiber_length(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_optimal_fiber_length(swigCPtr, this, initValue);
  }

  public double get_optimal_fiber_length() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_optimal_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_fiber_length(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_optimal_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_pennation_angle_at_optimal(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_pennation_angle_at_optimal(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pennation_angle_at_optimal(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_pennation_angle_at_optimal(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_pennation_angle_at_optimal(swigCPtr, this, value);
  }

  public void constructProperty_pennation_angle_at_optimal(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_pennation_angle_at_optimal(swigCPtr, this, initValue);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_pennation_angle_at_optimal__SWIG_1(swigCPtr, this), false);
  }

  public void set_pennation_angle_at_optimal(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_pennation_angle_at_optimal__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_maximum_pennation_angle(MuscleFixedWidthPennationModel source) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_copyProperty_maximum_pennation_angle(swigCPtr, this, MuscleFixedWidthPennationModel.getCPtr(source), source);
  }

  public double get_maximum_pennation_angle(int i) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle(int i) {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_maximum_pennation_angle(int i, double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_maximum_pennation_angle(double value) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_append_maximum_pennation_angle(swigCPtr, this, value);
  }

  public void constructProperty_maximum_pennation_angle(double initValue) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_constructProperty_maximum_pennation_angle(swigCPtr, this, initValue);
  }

  public double get_maximum_pennation_angle() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_get_maximum_pennation_angle__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_maximum_pennation_angle() {
    return new SWIGTYPE_p_double(opensimSimulationJNI.MuscleFixedWidthPennationModel_upd_maximum_pennation_angle__SWIG_1(swigCPtr, this), false);
  }

  public void set_maximum_pennation_angle(double value) {
    opensimSimulationJNI.MuscleFixedWidthPennationModel_set_maximum_pennation_angle__SWIG_1(swigCPtr, this, value);
  }

  public MuscleFixedWidthPennationModel() {
    this(opensimSimulationJNI.new_MuscleFixedWidthPennationModel__SWIG_0(), true);
  }

  public MuscleFixedWidthPennationModel(double optimalFiberLength, double optimalPennationAngle, double maximumPennationAngle) {
    this(opensimSimulationJNI.new_MuscleFixedWidthPennationModel__SWIG_1(optimalFiberLength, optimalPennationAngle, maximumPennationAngle), true);
  }

  public double getParallelogramHeight() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getParallelogramHeight(swigCPtr, this);
  }

  public double getMinimumFiberLength() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getMinimumFiberLength(swigCPtr, this);
  }

  public double getMinimumFiberLengthAlongTendon() {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_getMinimumFiberLengthAlongTendon(swigCPtr, this);
  }

  public double calcPennationAngle(double fiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngle(swigCPtr, this, fiberLength);
  }

  public double calcTendonLength(double cosPennationAngle, double fiberLength, double muscleLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcTendonLength(swigCPtr, this, cosPennationAngle, fiberLength, muscleLength);
  }

  public double calcFiberLengthAlongTendon(double fiberLength, double cosPennationAngle) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberLengthAlongTendon(swigCPtr, this, fiberLength, cosPennationAngle);
  }

  public double calcPennationAngularVelocity(double tanPennationAngle, double fiberLength, double fiberVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngularVelocity(swigCPtr, this, tanPennationAngle, fiberLength, fiberVelocity);
  }

  public double calcTendonVelocity(double cosPennationAngle, double sinPennationAngle, double pennationAngularVelocity, double fiberLength, double fiberVelocity, double muscleVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcTendonVelocity(swigCPtr, this, cosPennationAngle, sinPennationAngle, pennationAngularVelocity, fiberLength, fiberVelocity, muscleVelocity);
  }

  public double calcFiberVelocityAlongTendon(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberVelocityAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  public double calcPennationAngularAcceleration(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcPennationAngularAcceleration(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity);
  }

  public double calcFiberAccelerationAlongTendon(double fiberLength, double fiberVelocity, double fiberAcceleration, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double pennationAngularAcceleration) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberAccelerationAlongTendon(swigCPtr, this, fiberLength, fiberVelocity, fiberAcceleration, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, pennationAngularAcceleration);
  }

  public double calc_DFiberLengthAlongTendon_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DFiberLengthAlongTendon_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  public double calc_DPennationAngularVelocity_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DPennationAngularVelocity_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength);
  }

  public double calc_DFiberVelocityAlongTendon_DfiberLength(double fiberLength, double fiberVelocity, double sinPennationAngle, double cosPennationAngle, double pennationAngularVelocity, double DpennationAngle_DfiberLength, double DpennationAngularVelocity_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DFiberVelocityAlongTendon_DfiberLength(swigCPtr, this, fiberLength, fiberVelocity, sinPennationAngle, cosPennationAngle, pennationAngularVelocity, DpennationAngle_DfiberLength, DpennationAngularVelocity_DfiberLength);
  }

  public double calc_DPennationAngle_DfiberLength(double fiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DPennationAngle_DfiberLength(swigCPtr, this, fiberLength);
  }

  public double calc_DTendonLength_DfiberLength(double fiberLength, double sinPennationAngle, double cosPennationAngle, double DpennationAngle_DfiberLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calc_DTendonLength_DfiberLength(swigCPtr, this, fiberLength, sinPennationAngle, cosPennationAngle, DpennationAngle_DfiberLength);
  }

  public double calcFiberLength(double muscleLength, double tendonLength) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberLength(swigCPtr, this, muscleLength, tendonLength);
  }

  public double calcFiberVelocity(double cosPennationAngle, double muscleVelocity, double tendonVelocity) {
    return opensimSimulationJNI.MuscleFixedWidthPennationModel_calcFiberVelocity(swigCPtr, this, cosPennationAngle, muscleVelocity, tendonVelocity);
  }

}
