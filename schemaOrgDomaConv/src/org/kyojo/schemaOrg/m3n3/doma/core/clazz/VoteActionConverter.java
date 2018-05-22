package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.VOTE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.VoteAction;

@ExternalDomain
public class VoteActionConverter implements DomainConverter<VoteAction, String> {

	@Override
	public String fromDomainToValue(VoteAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public VoteAction fromValueToDomain(String value) {
		return new VOTE_ACTION(value);
	}

}
