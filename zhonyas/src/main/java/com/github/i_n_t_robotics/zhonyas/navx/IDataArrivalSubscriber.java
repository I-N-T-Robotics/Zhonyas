package com.github.i_n_t_robotics.zhonyas.navx;

public interface IDataArrivalSubscriber {
    public void untimestampedDataReceived( long system_timestamp, Object kind );
    public void timestampedDataReceived( long system_timestamp, long sensor_timestamp, Object kind );
    public void yawReset();
}
