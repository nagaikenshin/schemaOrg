package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.VOTE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.VoteAction;

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
