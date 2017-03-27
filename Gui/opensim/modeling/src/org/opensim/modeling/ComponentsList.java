/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentsList {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ComponentsList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentsList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentsList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ComponentsList(Component root, ComponentFilter f) {
    this(opensimCommonJNI.new_ComponentsList__SWIG_0(Component.getCPtr(root), root, ComponentFilter.getCPtr(f), f), true);
  }

  public ComponentsList(Component root) {
    this(opensimCommonJNI.new_ComponentsList__SWIG_1(Component.getCPtr(root), root), true);
  }

  public ComponentIterator begin() {
    return new ComponentIterator(opensimCommonJNI.ComponentsList_begin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Component_const_t__type_t cbegin() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Component_const_t__type_t(opensimCommonJNI.ComponentsList_cbegin(swigCPtr, this), true);
  }

  public ComponentIterator end() {
    return new ComponentIterator(opensimCommonJNI.ComponentsList_end__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Component_const_t__type_t cend() {
    return new SWIGTYPE_p_OpenSim__ComponentListIteratorT_std__add_constT_OpenSim__Component_const_t__type_t(opensimCommonJNI.ComponentsList_cend(swigCPtr, this), true);
  }

  public void setFilter(ComponentFilter filter) {
    opensimCommonJNI.ComponentsList_setFilter(swigCPtr, this, ComponentFilter.getCPtr(filter), filter);
  }

}
