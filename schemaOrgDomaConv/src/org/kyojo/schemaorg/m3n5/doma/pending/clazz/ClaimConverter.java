package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CLAIM;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Claim;

@ExternalDomain
public class ClaimConverter implements DomainConverter<Claim, String> {

	@Override
	public String fromDomainToValue(Claim domain) {
		return domain.getNativeValue();
	}

	@Override
	public Claim fromValueToDomain(String value) {
		return new CLAIM(value);
	}

}
