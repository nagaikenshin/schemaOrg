package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROGRAM_MEMBERSHIP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ProgramMembership;

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
