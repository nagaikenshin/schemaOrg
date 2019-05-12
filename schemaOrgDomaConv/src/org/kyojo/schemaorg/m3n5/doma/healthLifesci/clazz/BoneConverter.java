package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.BONE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Bone;

@ExternalDomain
public class BoneConverter implements DomainConverter<Bone, String> {

	@Override
	public String fromDomainToValue(Bone domain) {
		return domain.getNativeValue();
	}

	@Override
	public Bone fromValueToDomain(String value) {
		return new BONE(value);
	}

}
