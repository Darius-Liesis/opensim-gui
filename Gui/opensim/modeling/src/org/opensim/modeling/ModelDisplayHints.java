/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelDisplayHints extends OpenSimObject {
  private transient long swigCPtr;

  public ModelDisplayHints(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ModelDisplayHints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelDisplayHints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ModelDisplayHints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelDisplayHints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.ModelDisplayHints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelDisplayHints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.ModelDisplayHints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.ModelDisplayHints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.ModelDisplayHints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelDisplayHints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.ModelDisplayHints_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_show_wrap_geometry(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_wrap_geometry(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_wrap_geometry(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_wrap_geometry__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_wrap_geometry(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_wrap_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_wrap_geometry(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_wrap_geometry__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_wrap_geometry(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_wrap_geometry(swigCPtr, this, value);
  }

  public void constructProperty_show_wrap_geometry(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_wrap_geometry(swigCPtr, this, initValue);
  }

  public boolean get_show_wrap_geometry() {
    return opensimCommonJNI.ModelDisplayHints_get_show_wrap_geometry__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_wrap_geometry() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_wrap_geometry__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_wrap_geometry(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_wrap_geometry__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_contact_geometry(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_contact_geometry(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_contact_geometry(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_contact_geometry__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_contact_geometry(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_contact_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_contact_geometry(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_contact_geometry__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_contact_geometry(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_contact_geometry(swigCPtr, this, value);
  }

  public void constructProperty_show_contact_geometry(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_contact_geometry(swigCPtr, this, initValue);
  }

  public boolean get_show_contact_geometry() {
    return opensimCommonJNI.ModelDisplayHints_get_show_contact_geometry__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_contact_geometry() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_contact_geometry__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_contact_geometry(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_contact_geometry__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_path_geometry(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_path_geometry(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_path_geometry(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_path_geometry__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_path_geometry(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_path_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_path_geometry(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_path_geometry__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_path_geometry(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_path_geometry(swigCPtr, this, value);
  }

  public void constructProperty_show_path_geometry(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_path_geometry(swigCPtr, this, initValue);
  }

  public boolean get_show_path_geometry() {
    return opensimCommonJNI.ModelDisplayHints_get_show_path_geometry__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_path_geometry() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_path_geometry__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_path_geometry(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_path_geometry__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_path_points(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_path_points(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_path_points(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_path_points__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_path_points(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_path_points__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_path_points(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_path_points__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_path_points(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_path_points(swigCPtr, this, value);
  }

  public void constructProperty_show_path_points(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_path_points(swigCPtr, this, initValue);
  }

  public boolean get_show_path_points() {
    return opensimCommonJNI.ModelDisplayHints_get_show_path_points__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_path_points() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_path_points__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_path_points(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_path_points__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_markers(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_markers(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_markers(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_markers__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_markers(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_markers__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_markers(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_markers__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_markers(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_markers(swigCPtr, this, value);
  }

  public void constructProperty_show_markers(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_markers(swigCPtr, this, initValue);
  }

  public boolean get_show_markers() {
    return opensimCommonJNI.ModelDisplayHints_get_show_markers__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_markers() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_markers__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_markers(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_markers__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_marker_color(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_marker_color(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public Vec3 get_marker_color(int i) {
    return new Vec3(opensimCommonJNI.ModelDisplayHints_get_marker_color__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_marker_color(int i) {
    return new Vec3(opensimCommonJNI.ModelDisplayHints_upd_marker_color__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_marker_color(int i, Vec3 value) {
    opensimCommonJNI.ModelDisplayHints_set_marker_color__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_marker_color(Vec3 value) {
    return opensimCommonJNI.ModelDisplayHints_append_marker_color(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_marker_color(Vec3 initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_marker_color(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_marker_color() {
    return new Vec3(opensimCommonJNI.ModelDisplayHints_get_marker_color__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_marker_color() {
    return new Vec3(opensimCommonJNI.ModelDisplayHints_upd_marker_color__SWIG_1(swigCPtr, this), false);
  }

  public void set_marker_color(Vec3 value) {
    opensimCommonJNI.ModelDisplayHints_set_marker_color__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_show_forces(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_forces(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_forces(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_forces__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_forces(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_forces__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_forces(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_forces__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_forces(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_forces(swigCPtr, this, value);
  }

  public void constructProperty_show_forces(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_forces(swigCPtr, this, initValue);
  }

  public boolean get_show_forces() {
    return opensimCommonJNI.ModelDisplayHints_get_show_forces__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_forces() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_forces__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_forces(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_forces__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_frames(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_frames(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_frames(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_frames__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_frames(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_frames__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_frames(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_frames__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_frames(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_frames(swigCPtr, this, value);
  }

  public void constructProperty_show_frames(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_frames(swigCPtr, this, initValue);
  }

  public boolean get_show_frames() {
    return opensimCommonJNI.ModelDisplayHints_get_show_frames__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_frames() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_frames__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_frames(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_frames__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_labels(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_labels(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_labels(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_labels__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_labels(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_labels__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_labels(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_labels__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_labels(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_labels(swigCPtr, this, value);
  }

  public void constructProperty_show_labels(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_labels(swigCPtr, this, initValue);
  }

  public boolean get_show_labels() {
    return opensimCommonJNI.ModelDisplayHints_get_show_labels__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_labels() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_labels__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_labels(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_labels__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_show_debug_geometry(ModelDisplayHints source) {
    opensimCommonJNI.ModelDisplayHints_copyProperty_show_debug_geometry(swigCPtr, this, ModelDisplayHints.getCPtr(source), source);
  }

  public boolean get_show_debug_geometry(int i) {
    return opensimCommonJNI.ModelDisplayHints_get_show_debug_geometry__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_show_debug_geometry(int i) {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_debug_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_show_debug_geometry(int i, boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_debug_geometry__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_show_debug_geometry(boolean value) {
    return opensimCommonJNI.ModelDisplayHints_append_show_debug_geometry(swigCPtr, this, value);
  }

  public void constructProperty_show_debug_geometry(boolean initValue) {
    opensimCommonJNI.ModelDisplayHints_constructProperty_show_debug_geometry(swigCPtr, this, initValue);
  }

  public boolean get_show_debug_geometry() {
    return opensimCommonJNI.ModelDisplayHints_get_show_debug_geometry__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_show_debug_geometry() {
    return new SWIGTYPE_p_bool(opensimCommonJNI.ModelDisplayHints_upd_show_debug_geometry__SWIG_1(swigCPtr, this), false);
  }

  public void set_show_debug_geometry(boolean value) {
    opensimCommonJNI.ModelDisplayHints_set_show_debug_geometry__SWIG_1(swigCPtr, this, value);
  }

  public ModelDisplayHints() {
    this(opensimCommonJNI.new_ModelDisplayHints(), true);
  }

}
