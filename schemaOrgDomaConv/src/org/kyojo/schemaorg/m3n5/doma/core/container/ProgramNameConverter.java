package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PROGRAM_NAME;
import org.kyojo.schemaorg.m3n5.core.Container.ProgramName;

@ExternalDomain
public class ProgramNameConverter implements DomainConverter<ProgramName, String> {

	@Override
	public String fromDomainToValue(ProgramName domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProgramName fromValueToDomain(String value) {
		return new PROGRAM_NAME(value);
	}

}
