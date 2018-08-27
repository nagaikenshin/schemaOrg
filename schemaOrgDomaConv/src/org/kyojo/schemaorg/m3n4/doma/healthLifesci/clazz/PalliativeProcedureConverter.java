package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.PALLIATIVE_PROCEDURE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.PalliativeProcedure;

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
