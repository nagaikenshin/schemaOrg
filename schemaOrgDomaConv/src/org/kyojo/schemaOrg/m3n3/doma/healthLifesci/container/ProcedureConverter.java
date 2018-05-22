package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PROCEDURE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Procedure;

@ExternalDomain
public class ProcedureConverter implements DomainConverter<Procedure, String> {

	@Override
	public String fromDomainToValue(Procedure domain) {
		return domain.getNativeValue();
	}

	@Override
	public Procedure fromValueToDomain(String value) {
		return new PROCEDURE(value);
	}

}
