package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROGRAMMING_MODEL;
import org.kyojo.schemaOrg.m3n3.core.Container.ProgrammingModel;

@ExternalDomain
public class ProgrammingModelConverter implements DomainConverter<ProgrammingModel, String> {

	@Override
	public String fromDomainToValue(ProgrammingModel domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProgrammingModel fromValueToDomain(String value) {
		return new PROGRAMMING_MODEL(value);
	}

}
