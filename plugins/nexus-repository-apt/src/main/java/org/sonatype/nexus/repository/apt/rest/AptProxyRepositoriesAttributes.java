/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.apt.rest;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @since 3.next
 */
public class AptProxyRepositoriesAttributes
{
  @ApiModelProperty(value = "Distribution to fetch", example = "bionic")
  @NotEmpty
  private final String distribution;

  @ApiModelProperty(value = "Whether this repository is flat", example = "false")
  @NotNull
  private final Boolean flat;

  @JsonCreator
  public AptProxyRepositoriesAttributes(
      @JsonProperty("distribution") final String distribution,
      @JsonProperty("flat") final Boolean flat)
  {
    this.distribution = distribution;
    this.flat = flat;
  }

  public String getDistribution() {
    return distribution;
  }

  public Boolean getFlat() {
    return flat;
  }
}
