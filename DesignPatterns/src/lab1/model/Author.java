/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

package lab1.model;

/**
 * @author <a href="mailto:bario@ssi-schaefer-noell.com">bario</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class Author {
  private String name;

  public Author(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Author [name=" + name + "]";
  }

}
