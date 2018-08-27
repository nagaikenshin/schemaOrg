package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PERMISSIONS;
import org.kyojo.schemaorg.m3n4.core.Container.Permissions;

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
