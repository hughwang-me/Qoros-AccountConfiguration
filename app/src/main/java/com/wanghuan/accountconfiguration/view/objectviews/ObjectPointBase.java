package com.wanghuan.accountconfiguration.view.objectviews;

import android.content.Context;
import android.graphics.PointF;

import com.wanghuan.accountconfiguration.util.ACUtils;

/**
 * Created by h1 on 16/3/31 10:53.
 * email: h18501667737@gmail.com
 */
public abstract class ObjectPointBase extends ObjectBase{

    private final static float POINT_3_OFFSET = 0.3f;

    public ObjectPointBase(Context context) {
        super(context);
    }

    private float radius = SEX_DEFAULT_RADIUS;
    private float radius_dot = DOT_DEFAULT_RADIUS;
    private float radius_dot_core = DOT_DEFAULT_RADIUS_CORE;
    private float radius_dot_action = DOT_DEFAULT_RADIUS_ACTION;
    private float radius_small = SEX_ITEM_DEFAULT_RADIUS;

    public float getRadius() {
        return radius;
    }

    public float getRadius_dot() {
        return radius_dot;
    }

    public float getRadius_dot_core() {
        return radius_dot_core;
    }

    public float getRadius_dot_action() {
        return radius_dot_action;
    }

    public float getRadius_small() {
        return radius_small;
    }

    public final static int SEX_DEFAULT_RADIUS = 200;
    public final static int DOT_DEFAULT_RADIUS = 20;
    public final static int DOT_DEFAULT_RADIUS_CORE = 10;
    public final static int DOT_DEFAULT_RADIUS_ACTION = 50;
    public final static int SEX_ITEM_DEFAULT_RADIUS = 90;

    public PointF welcome_point1 = new PointF(measureWidth , measureHeight/2);
    public PointF welcome_point2 = new PointF(measureWidth/2 , measureHeight/2 + measureHeight/6);
    public PointF welcome_point3 = new PointF(measureWidth * POINT_3_OFFSET , measureHeight/2 + measureHeight/4);
    public PointF welcome_point4 = new PointF(-measureWidth , measureHeight);

    public PointF sex_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF sex_point2 = new PointF(measureWidth - SEX_DEFAULT_RADIUS * 0.6f, measureHeight/2);
    public PointF sex_point3 = new PointF(measureWidth * POINT_3_OFFSET , measureHeight/2 + measureHeight/4);
    public PointF sex_point4 = new PointF(-measureWidth , measureHeight);

    public PointF welcome_dot_point1 = new PointF(measureWidth + DOT_DEFAULT_RADIUS , measureHeight/2);
    public PointF welcome_dot_point2 = new PointF(measureWidth * 0.55f, measureHeight * 0.55f);
    public PointF welcome_dot_point3 = ACUtils.calculateMidPoint(welcome_point3 , sex_point2);
    public PointF welcome_dot_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headIcon_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headIcon_point2 = new PointF(measureWidth - SEX_DEFAULT_RADIUS * 0.6f, measureHeight/2);
    public PointF headIcon_point3 = new PointF(measureWidth * POINT_3_OFFSET , measureHeight/2 + measureHeight/4);
    public PointF headIcon_point4 = new PointF(-measureWidth , measureHeight);

    public PointF sexBoy_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF sexBoy_point2 = new PointF(measureWidth * 0.35f, measureHeight/2);
    public PointF sexBoy_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF sexBoy_point4 = new PointF(-measureWidth , measureHeight);

    public PointF sexGirl_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF sexGirl_point2 = new PointF(measureWidth * 0.75f, measureHeight * 0.75f);
    public PointF sexGirl_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF sexGirl_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headCamera_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headCamera_point2 = new PointF(measureWidth * 0.35f, measureHeight * 0.4f);
    public PointF headCamera_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF headCamera_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headAlbum_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headAlbum_point2 = new PointF(measureWidth * 0.5f, measureHeight * 0.55f);
    public PointF headAlbum_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF headAlbum_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headSkip_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headSkip_point2 = new PointF(measureWidth * 0.75f, measureHeight * 0.65f);
    public PointF headSkip_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF headSkip_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headDot_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headDot_point2 = new PointF(measureWidth * 0.45f, measureHeight * 0.4f);
    public PointF headDot_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF headDot_point4 = new PointF(-measureWidth , measureHeight);

    public PointF headChange_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF headChange_point2 = new PointF(measureWidth * 0.75f, measureHeight * 0.85f);
    public PointF headChange_point3 = ACUtils.calculateMidPoint(sex_point3 , headIcon_point2);
    public PointF headChange_point4 = new PointF(-measureWidth , measureHeight);

    public PointF birthday_point1 = new PointF(measureWidth + SEX_DEFAULT_RADIUS , measureHeight/2);
    public PointF birthday_point2 = new PointF(measureWidth - SEX_DEFAULT_RADIUS * 0.6f, measureHeight * 0.3f);
    public PointF birthday_point3 = new PointF(measureWidth * POINT_3_OFFSET , measureHeight/2 + measureHeight/4);
    public PointF birthday_point4 = new PointF(-measureWidth , measureHeight);




}
