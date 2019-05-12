package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.JOINT;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.Joint;

@ExternalDomain
public class JointConverter implements DomainConverter<Joint, String> {

	@Override
	public String fromDomainToValue(Joint domain) {
		return domain.getNativeValue();
	}

	@Override
	public Joint fromValueToDomain(String value) {
		return new JOINT(value);
	}

}