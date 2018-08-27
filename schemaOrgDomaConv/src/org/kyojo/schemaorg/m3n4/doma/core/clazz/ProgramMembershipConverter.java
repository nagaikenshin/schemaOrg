package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROGRAM_MEMBERSHIP;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProgramMembership;

@ExternalDomain
public class ProgramMembershipConverter implements DomainConverter<ProgramMembership, String> {

	@Override
	public String fromDomainToValue(ProgramMembership domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProgramMembership fromValueToDomain(String value) {
		return new PROGRAM_MEMBERSHIP(value);
	}

}
