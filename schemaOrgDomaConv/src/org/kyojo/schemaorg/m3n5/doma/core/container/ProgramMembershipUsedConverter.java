package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PROGRAM_MEMBERSHIP_USED;
import org.kyojo.schemaorg.m3n5.core.Container.ProgramMembershipUsed;

@ExternalDomain
public class ProgramMembershipUsedConverter implements DomainConverter<ProgramMembershipUsed, String> {

	@Override
	public String fromDomainToValue(ProgramMembershipUsed domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProgramMembershipUsed fromValueToDomain(String value) {
		return new PROGRAM_MEMBERSHIP_USED(value);
	}

}
