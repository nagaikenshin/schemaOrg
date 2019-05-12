package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PROFILE_PAGE;
import org.kyojo.schemaorg.m3n5.core.Clazz.ProfilePage;

@ExternalDomain
public class ProfilePageConverter implements DomainConverter<ProfilePage, String> {

	@Override
	public String fromDomainToValue(ProfilePage domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProfilePage fromValueToDomain(String value) {
		return new PROFILE_PAGE(value);
	}

}
