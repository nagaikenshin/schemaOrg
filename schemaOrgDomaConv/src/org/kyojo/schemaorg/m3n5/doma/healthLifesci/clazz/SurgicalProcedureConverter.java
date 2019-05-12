package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SURGICAL_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.SurgicalProcedure;

@ExternalDomain
public class SurgicalProcedureConverter implements DomainConverter<SurgicalProcedure, String> {

	@Override
	public String fromDomainToValue(SurgicalProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public SurgicalProcedure fromValueToDomain(String value) {
		return new SURGICAL_PROCEDURE(value);
	}

}
