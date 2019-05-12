package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.FUNDING_SCHEME;
import org.kyojo.schemaorg.m3n5.pending.Clazz.FundingScheme;

@ExternalDomain
public class FundingSchemeConverter implements DomainConverter<FundingScheme, String> {

	@Override
	public String fromDomainToValue(FundingScheme domain) {
		return domain.getNativeValue();
	}

	@Override
	public FundingScheme fromValueToDomain(String value) {
		return new FUNDING_SCHEME(value);
	}

}
