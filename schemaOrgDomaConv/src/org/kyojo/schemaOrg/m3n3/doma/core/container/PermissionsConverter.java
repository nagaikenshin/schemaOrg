package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PERMISSIONS;
import org.kyojo.schemaOrg.m3n3.core.Container.Permissions;

@ExternalDomain
public class PermissionsConverter implements DomainConverter<Permissions, String> {

	@Override
	public String fromDomainToValue(Permissions domain) {
		return domain.getNativeValue();
	}

	@Override
	public Permissions fromValueToDomain(String value) {
		return new PERMISSIONS(value);
	}

}
