package com.raquo.dombuilder.jsdom.simple.builders

import com.raquo.domtypes.generic.builders.BoundedBuilder
import com.raquo.domtypes.generic.keys.EventProp
import org.scalajs.dom

trait SimpleEventBuilder extends BoundedBuilder[EventProp, dom.Event] {

  override def build[Ev <: dom.Event](key: String): EventProp[Ev] = {
    new EventProp[Ev](name = key)
  }
}