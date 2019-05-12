package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PALLIATIVE_PROCEDURE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.PalliativeProcedure;

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
