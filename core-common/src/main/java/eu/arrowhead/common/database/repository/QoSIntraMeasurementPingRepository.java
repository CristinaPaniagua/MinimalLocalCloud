/********************************************************************************
 * Copyright (c) 2020 AITIA
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   AITIA - implementation
 *   Arrowhead Consortia - conceptualization
 ********************************************************************************/

package eu.arrowhead.common.database.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import eu.arrowhead.common.database.entity.QoSIntraMeasurement;
import eu.arrowhead.common.database.entity.QoSIntraPingMeasurement;

@Repository
public interface QoSIntraMeasurementPingRepository extends RefreshableRepository<QoSIntraPingMeasurement,Long> {
	
	//=================================================================================================
	// methods

	//-------------------------------------------------------------------------------------------------
	public Optional<QoSIntraPingMeasurement> findByMeasurement(final QoSIntraMeasurement measurement);
}