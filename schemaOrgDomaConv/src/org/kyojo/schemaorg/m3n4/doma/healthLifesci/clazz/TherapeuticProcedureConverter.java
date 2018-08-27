package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.THERAPEUTIC_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.TherapeuticProcedure;

@ExternalDomain
public class TherapeuticProcedureConverter implements DomainConverter<TherapeuticProcedure, String> {

	@Override
	public String fromDomainToValue(TherapeuticProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public TherapeuticProcedure fromValueToDomain(String value) {
		return new THERAPEUTIC_PROCEDURE(value);
	}

}
