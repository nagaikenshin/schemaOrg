package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PALLIATIVE_PROCEDURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.PalliativeProcedure;

@ExternalDomain
public class PalliativeProcedureConverter implements DomainConverter<PalliativeProcedure, String> {

	@Override
	public String fromDomainToValue(PalliativeProcedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public PalliativeProcedure fromValueToDomain(String value) {
		return new PALLIATIVE_PROCEDURE(value);
	}

}
