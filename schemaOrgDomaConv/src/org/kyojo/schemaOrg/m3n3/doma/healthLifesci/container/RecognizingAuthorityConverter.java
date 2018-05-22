package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RECOGNIZING_AUTHORITY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RecognizingAuthority;

@ExternalDomain
public class RecognizingAuthorityConverter implements DomainConverter<RecognizingAuthority, String> {

	@Override
	public String fromDomainToValue(RecognizingAuthority domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecognizingAuthority fromValueToDomain(String value) {
		return new RECOGNIZING_AUTHORITY(value);
	}

}
