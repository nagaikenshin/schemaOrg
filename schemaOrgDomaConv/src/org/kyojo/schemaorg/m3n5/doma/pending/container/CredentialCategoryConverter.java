package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CREDENTIAL_CATEGORY;
import org.kyojo.schemaorg.m3n5.pending.Container.CredentialCategory;

@ExternalDomain
public class CredentialCategoryConverter implements DomainConverter<CredentialCategory, String> {

	@Override
	public String fromDomainToValue(CredentialCategory domain) {
		return domain.getNativeValue();
	}

	@Override
	public CredentialCategory fromValueToDomain(String value) {
		return new CREDENTIAL_CATEGORY(value);
	}

}
