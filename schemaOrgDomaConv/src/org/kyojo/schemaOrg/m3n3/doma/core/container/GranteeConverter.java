package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GRANTEE;
import org.kyojo.schemaOrg.m3n3.core.Container.Grantee;

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
