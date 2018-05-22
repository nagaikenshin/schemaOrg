package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.EDUCATIONAL_CREDENTIAL_AWARDED;
import org.kyojo.schemaOrg.m3n3.pending.Container.EducationalCredentialAwarded;

@ExternalDomain
public class EducationalCredentialAwardedConverter implements DomainConverter<EducationalCredentialAwarded, String> {

	@Override
	public String fromDomainToValue(EducationalCredentialAwarded domain) {
		return domain.getNativeValue();
	}

	@Override
	public EducationalCredentialAwarded fromValueToDomain(String value) {
		return new EDUCATIONAL_CREDENTIAL_AWARDED(value);
	}

}
