package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GRANTEE;
import org.kyojo.schemaorg.m3n4.core.Container.Grantee;

@ExternalDomain
public class GranteeConverter implements DomainConverter<Grantee, String> {

	@Override
	public String fromDomainToValue(Grantee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Grantee fromValueToDomain(String value) {
		return new GRANTEE(value);
	}

}
